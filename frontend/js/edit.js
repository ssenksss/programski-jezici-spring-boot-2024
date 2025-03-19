
const id = params.get('id')

if (id == null || id == '') {
    window.location.href = './index.html'
}

const breadcrumb = document.getElementById('breadcrumb')
const sid = document.getElementById('id')
const naziv = document.getElementById('naziv')
const brend = document.getElementById('brendIme')
const pol = document.getElementById('kategorijaPol')
const created = document.getElementById('created')
const updated = document.getElementById('updated')

function formatDate(iso) {
    if (iso === null) return 'N/A' 
    return new Date(iso).toLocaleString('sr-RS') 

function findBrendByIme(ime) {
    return fetch(`http://localhost:8000/api/brend/ime/${ime}`)
        .then(rsp => {
            if (rsp.status === 200) return rsp.json() 
            throw new Error('Brend nije pronađen') 
        });
}

function fetchParfem(id) {
    return fetch(`http://localhost:8000/api/parfem/${id}`)
        .then(rsp => {
            if (rsp.status === 200) return rsp.json() 
            throw new Error('Parfem nije pronađen') 
        });
}

fetchParfem(id)
    .then(data => {
        breadcrumb.innerText = `${data.naziv} ${data.brend.ime}` 
        sid.value = data.id 
        naziv.value = data.naziv 
        brend.value = data.brend.ime 
        pol.value = data.kategorija.pol 
        created.value = formatDate(data.createdAt) 
        updated.value = formatDate(data.updatedAt)
    })
    .catch(error => {
        alert(error.message)
        window.location.href = './index.html'
    })

document.getElementById('save').addEventListener('click', () => {
    findBrendByIme(brend.value)
        .then(brendData => {
            return fetch(`http://localhost:8000/api/parfem/${sid.value}`, {
                method: 'PUT',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    naziv: naziv.value, 
                    brend: brendData, 
                    kategorija: pol.value 
                })
            });
        })
        .then(rsp => {
            if (rsp.ok) {
                window.location.href = './index.html'
            } else {
                alert(`Izmena parfema nije uspela (HTTP ${rsp.status})`)
            }
        })
        .catch(error => {
            alert(error.message)
        })
})
}