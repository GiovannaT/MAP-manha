function Cars(marca, modelo, ano) {
    this.marca = marca
    this.modelo = modelo
    this.ano = ano
}

Cars.prototype.apresentar = function () {
    console.log(`Marca: ${this.marca}, Modelo: ${this.modelo}, Ano: ${this.ano}`)
}

const carro1 = new Cars("Honda", "Civic", 2020)
carro1.apresentar()