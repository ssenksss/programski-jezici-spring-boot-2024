const table = document.getElementById('table')
const template = document.getElementById('parfem')

fetchAllParfemi()

function fetchAllParfemi() {
    const parfemDetails = document.getElementById('parfem-details')
    parfemDetails.innerHTML = ''

    fetch('http://localhost:8000/api/parfem')
        .then(rsp => rsp.json())
        .then(data => {
            if (data.length === 0) {
                alert('Nema parfema za prikaz')
                return
            }
            data.forEach(parfem => {
                const copy = template.content.cloneNode(true)

                // Postavljanje linka za detalje parfema
                const nazivLink = copy.querySelector('.naziv a')
                nazivLink.href = `./details-perfume.html?id=${parfem.id}`
                nazivLink.innerText = parfem.naziv

                copy.querySelector('.ime').innerText = parfem.brend.ime

               
                const visokeNote = parfem.visokeNote ? parfem.visokeNote.join(', ') : 'N/A'
                copy.querySelector('.visoke-note').innerText = visokeNote

                
                const srednjeNote = parfem.srednjeNote ? parfem.srednjeNote.join(', ') : 'N/A'
                copy.querySelector('.srednje-note').innerText = srednjeNote

                
                const niskeNote = parfem.niskeNote ? parfem.niskeNote.join(', ') : 'N/A'
                copy.querySelector('.niske-note').innerText = niskeNote

                parfemDetails.appendChild(copy)
            });
        })
        .catch(error => {
            console.error('Greška pri dobijanju podataka:', error)
            alert('Došlo je do greške pri dobijanju podataka.')
        });
}

function fetchParfemById(id) {
    const parfemDetails = document.getElementById('parfem-details')
    parfemDetails.innerHTML = ''

    fetch(`http://localhost:8000/api/parfem/${id}`)
        .then(rsp => rsp.json())
        .then(data => {
            if (!data) {
                alert('Parfem nije pronađen')
                return
            }
            const copy = template.content.cloneNode(true)

           
            const nazivLink = copy.querySelector('.naziv a')
            nazivLink.href = `./details-perfume.html?id=${data.id}`
            nazivLink.innerText = data.naziv

            copy.querySelector('.ime').innerText = data.brend.ime

           
            const visokeNote = data.visokeNote ? data.visokeNote.join(', ') : 'N/A'
            copy.querySelector('.visoke-note').innerText = visokeNote

            const srednjeNote = data.srednjeNote ? data.srednjeNote.join(', ') : 'N/A'
            copy.querySelector('.srednje-note').innerText = srednjeNote

          
            const niskeNote = data.niskeNote ? data.niskeNote.join(', ') : 'N/A'
            copy.querySelector('.niske-note').innerText = niskeNote

            parfemDetails.appendChild(copy)
        })
        .catch(error => {
            console.error('Greška pri dobijanju podataka:', error)
            alert('Došlo je do greške pri dobijanju podataka.')
        })
}
