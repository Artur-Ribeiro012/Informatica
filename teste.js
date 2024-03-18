class Animal {
    constructor(nome, especie) {
        this.nome = nome;
        this.especie = especie;
    }
    cantar() {
        return `${this.nome} consegue cantar`
    }
    dancar() {
        return `${this.nome} consegue dançar`
    }
}

class Gato extends Animal {
    
}