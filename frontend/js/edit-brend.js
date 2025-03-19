

const id = params.get('id')

if (!id) {
    window.location.href = './brend.html'
}

// Pronalazimo HTML elemente za prikaz i unos podataka
const breadcrumb = document.getElementById('breadcrumb')
const bid = document.getElementById('brendId')
const brendIme = document.getElementById('brendIme')
const zemljaPorekla = document.getElementById('zemljaPorekla')
const created = document.getElementById('created')
const updated = document.getElementById('updated')

// Formatiranje datuma 
function formatDate(iso) {
    if (iso === null) return 'N/A'
    return new Date(iso).toLocaleString('sr-RS')
}

function fetchBrend(id) {
    return fetch(`http://localhost:8000/api/brend/${id}`)
        .then(rsp => {
            if (rsp.ok) return rsp.json()
            throw new Error('Brend nije pronađen')
        });
}

fetchBrend(id)
    .then(data => {
        breadcrumb.innerText = data.ime
        bid.value = data.id
        brendIme.value = data.ime
        zemljaPorekla.value = data.zemljaPorekla
        created.value = formatDate(data.createdAt)
        updated.value = formatDate(data.updatedAt)
    })
    .catch(error => {
        alert(error.message)
        window.location.href = './brend.html'
    });

document.getElementById('save').addEventListener('click', () => {
    const ime = brendIme.value.trim()
    const zemljaPoreklaValue = zemljaPorekla.value.trim()

   
    if (!ime) {
        alert('Polje imena brenda ne sme biti prazno');
        return
    }
    if (!zemljaPoreklaValue) {
        alert('Polje zemlje porekla brenda ne sme biti prazno');
        return
    }

    fetch(`http://localhost:8000/api/brend/${id}`, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            ime: ime, 
            zemljaPorekla: zemljaPoreklaValue 
        })
    })
    .then(rsp => {
        if (rsp.ok) {
            window.location.href = './brend.html'
        } else {
            alert(`Izmena brenda nije uspela (HTTP ${rsp.status})`)
        }
    })
    .catch(error => {
        alert(`Greška: ${error.message}`)
    })
})
