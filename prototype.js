// Definindo a classe Pessoa
function Pessoa(nome) {
    this.nome = nome;
  }
  
  // Adicionando um método à classe Pessoa usando prototype
  Pessoa.prototype.dizerOla = function() {
    console.log(`Olá, meu nome é ${this.nome}!`);
  };
  
  // Criando uma instância da classe Pessoa
  const pessoa1 = new Pessoa("Christian");
  
  // Chamando o método dizerOla da instância
  pessoa1.dizerOla(); // Saída: Olá, meu nome é Christian!