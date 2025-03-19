const table = document.getElementById('table')
const template = document.getElementById('parfem')
const searchTitle = document.getElementById('search-title')

if(searchParam != null && searchParam != '') {
    searchTitle.innerText= 'Pretraga parfema'
    fetchParfemi('/naziv/'+searchParam)
} else{  
    searchTitle.innerText= 'Lista parfema'
    fetchParfemi()
}

   

function  fetchParfemi(url = ''){
    
    // Resetujemo tabelu pre nego što dodamo nove redove
    table.innerHTML = '';

    fetch(`http://localhost:8000/api/parfem${url}`)
    .then(rsp => rsp.json())
    .then(data => {
        if(data.length == 0){
            alert('Parfem nije pronađen')
            fetchParfemi()
            return
        }
        data.forEach(parfem => {
            const copy  = template.content.cloneNode(true)
            copy.querySelector('.id').innerText = parfem.id

              // Postavljanje href za detalje parfema
    const nazivLink = copy.querySelector('.naziv a');
    nazivLink.href = `./details-perfume.html?id=${parfem.id}`;
    nazivLink.innerText = parfem.naziv;
    
            copy.querySelector('.ime').innerText = parfem.brend.ime;
            copy.querySelector('.pol').innerText = parfem.kategorija.pol;
            copy.querySelector('.created').innerText = formatDate(parfem.createdAt)
            copy.querySelector('.updated').innerText = formatDate(parfem.updatedAt)
            copy.querySelector('.edit').href = `./edit.html?id=${parfem.id}`
            copy.querySelector('.remove').addEventListener('click', ()=>{
                if(confirm(`Želite obrisati parfem ${parfem.naziv} ${parfem.brend.ime} ${parfem.kategorija.pol}`))
                {
                    fetch(`http://localhost:8000/api/parfem/${parfem.id}`, {
                        method:'DELETE',
                    })
                    .then(rsp => {
                        if(rsp.status == 204){
                            window.location.href = './index.html'
                            return
                        }
                        alert( `Brisanje parfema nije uspelo ( HTTP ${rsp.status})` )
                    })
                }
            })

            table.appendChild(copy);
        })
    })

    function formatDate(iso) {
        if (iso === null) return 'N/A';
        return new Date(iso).toLocaleString('sr-RS');
    }
}