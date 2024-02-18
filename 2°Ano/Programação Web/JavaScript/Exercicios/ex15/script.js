function verificar() {
    var data = new Date()
    var ano = data.getFullYear()
    var fAno = document.getElementById('txtano')
    var res = document.getElementById('res')
    if(fAno.value.length == 0 || Number(fAno.value) > ano) {
        window.alert('[ERRO]')
    } else {
        var fse = document.getElementsByName('radsex')
        var idade = ano - Number(fAno.value)
        var gênero = ''
        var img = document.createElement('img')
        img.setAttribute('id', 'foto')
        if(fse[0].checked) {
            gênero = 'Homem'
            if(idade >=0 && idade< 10) {
                img.setAttribute('src', 'bebe-homem.jpg')
            } else if(idade< 21) {
                img.setAttribute('src', 'jovem-homem.jpg')
            } else if(idade < 50) {
                img.setAttribute('src', 'homem-adulto.jpg')
            } else {
                img.setAttribute('src', 'idoso-homem.jpg')
            }
        } else if(fse[1].checked) {
            gênero = 'Mulher'
            if(idade >=0 && idade< 10) {
                img.setAttribute('src', 'mulher-bebe.jpg')
            } else if(idade< 21) {
                img.setAttribute('src', 'jovem-mulher.jpg')
            } else if(idade < 50) {
                img.setAttribute('src', 'mulher-adulta.jpg')
            } else {
                img.setAttribute('src', 'mulher-idosa.jpg')
            }
        } 
        res.style.textAlign = 'center'
        res.innerHTML = `Detectamos ${gênero} com ${idade} anos`
        res.appendChild(img)
    }
}