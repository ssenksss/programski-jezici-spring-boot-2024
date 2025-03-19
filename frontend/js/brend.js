const table = document.getElementById('table')
const template = document.getElementById('brend')
const searchTitle = document.getElementById('search-title')

if(searchParam != null && searchParam != '') {
   searchTitle.innerText= 'Pretraga brendova'
   fetchBrend('/naziv/'+searchParam)
} else{  
   searchTitle.innerText= 'Lista brendova'
   fetchBrend()
}


function  fetchBrend(url = ''){
   fetch(`http://localhost:8000/api/brend${url}`)
   .then(rsp => rsp.json())
   .then(data => {
       if(data.length == 0){
           alert('Brend nije pronađen')
           fetchBrend()
           return
       }        
       data.forEach(brend => {
           const copy  = template.content.cloneNode(true)
           copy.querySelector('.id').innerText = brend.id 
           copy.querySelector('.ime').innerText = brend.ime
           copy.querySelector('.zemljaPorekla').innerText = brend.zemljaPorekla 
           copy.querySelector('.created').innerText = formatDate(brend.createdAt)
           copy.querySelector('.updated').innerText = formatDate(brend.updatedAt)
           copy.querySelector('.edit').href = `./edit-brend.html?id=${brend.id}`
           copy.querySelector('.remove').addEventListener('click', ()=>{
               if(confirm(`Želite obrisati brend ${brend.ime} ${brend.zemljaPorekla} `))
               {
                   fetch(`http://localhost:8000/api/brend/${brend.id}`, {
                       method:'DELETE',
                   })
                   .then(rsp => {
                       if(rsp.status == 204){
                           window.location.href = './brend.html'
                           return
                       }
                       alert( `Brisanje brenda nije uspelo ( HTTP ${rsp.status})` )
                   })
               }
           })

           table.appendChild(copy);
       })
   })

   function formatDate(iso) {
       if (iso === null) return 'N/A'
       return new Date(iso).toLocaleString('sr-RS')
   }
}







