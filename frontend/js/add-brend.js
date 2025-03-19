document.getElementById('save').addEventListener('click', () => {
    const brendIme = document.getElementById('brendIme').value.trim()
    const zemljaPorekla = document.getElementById('zemljaPorekla').value.trim()

    if (!brendIme) {
        alert('Polje imena brenda ne sme biti prazno')
        return;
    }
    if (!zemljaPorekla) {
        alert('Polje zemlje porekla brenda ne sme biti prazno')
        return;
    }

    // Direktno dodavanje novog brend bez provere da li postoji
    fetch('http://localhost:8000/api/brend', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            ime: brendIme,         
            zemljaPorekla: zemljaPorekla
        })
    })
    .then(rsp => {
        if (rsp.ok) {
            window.location.href = './brend.html'; 
        } else {
            alert(`Dodavanje brenda nije uspelo (HTTP ${rsp.status})`)
        }
    })
    .catch(error => {
        alert(`Greška: ${error.message}`)
    })
})
