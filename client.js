const soap = require("soap");
const io = require("console-read-write");

const url = "http://localhost:3333/calculadora?wsdl";

async function tensao() {
  io.write("Amperes: ");
  const amperes = await io.read();
  io.write("Ohms: ");
  const ohms = await io.read();
  const args = { amperes: amperes, ohms: ohms };

  soap.createClient(url, function (err, client) {
    client.tensao(args, function (err, result) {
      console.log(result);
    });
  });
}

async function corrente() {
  io.write("Volts: ");
  const volts = await io.read();
  io.write("Ohms: ");
  const ohms = await io.read();
  const args = { volts: volts, ohms: ohms };

  soap.createClient(url, function (err, client) {
    client.corrente(args, function (err, result) {
      console.log(result);
    });
  });
}

async function resistencia() {
  io.write("Volts: ");
  const volts = await io.read();
  io.write("Amperes: ");
  const amperes = await io.read();
  const args = { volts: volts, amperes: amperes };

  soap.createClient(url, function (err, client) {
    client.resistencia(args, function (err, result) {
      console.log(result);
    });
  });
}

async function main() {
  io.write("1 - Tensão | 2 - Corrente | 3 - Resistência ");
  const opcao = await io.read();
  switch (opcao) {
    case "1":
      tensao();
      break;
    case "2":
      corrente();
      break;
    case "3":
      resistencia();
      break;
    default:
      console.log("Opção inválida");
      break;
  }
}

main();
