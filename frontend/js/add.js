document.getElementById('save').addEventListener('click', () => {
    const naziv = document.getElementById('naziv').value.trim()
    const brendIme = document.getElementById('brendIme').value.trim()
    const pol = document.getElementById('kategorijaPol').value.trim()

    
    if (!naziv) {
        alert('Polje naziva parfema ne sme biti prazno')
        return
    }
    if (!brendIme) {
        alert('Polje imena brenda ne sme biti prazno')
        return
    }
    if (!pol) {
        alert('Polje pola parfema ne sme biti prazno')
        return
    }

    // Pronalazi brend po imenu
    function findBrendByIme(ime) {
        return fetch(`http://localhost:8000/api/brend/ime/${ime}`)
            .then(rsp => {
                if (rsp.ok) return rsp.json()
                throw new Error('Brend nije pronađen')
            });
    }

    // Pronadje brend i doda parfem
    findBrendByIme(brendIme)
        .then(brendData => {
            return fetch('http://localhost:8000/api/parfem', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    naziv: naziv,
                    brend: { id: brendData.id }, 
                    kategorija: pol
                })
            });
        })
        .then(rsp => {
            if (rsp.ok) {
                window.location.href = './index.html';
            } else {
                alert(`Dodavanje parfema nije uspelo (HTTP ${rsp.status})`)
            }
        })
        .catch(error => {
            alert(`Greška: ${error.message}`)
        })
})