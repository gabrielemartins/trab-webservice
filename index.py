from suds.client import Client
client = Client('http://localhost:3333/calculadora?wsdl')

def tensao():
    amperes = input("Amperes: ")
    ohms = input("Ohms: ")
    result = client.service.tensao(amperes, ohms)
    print (result)

def corrente():
    volts = input("Volts: ")
    ohms = input("Ohms: ")
    result = client.service.corrente(volts, ohms)
    print (result)

def resistencia():
    volts = input("Volts: ")
    amperes = input("Amperes: ")
    result = client.service.resistencia(volts, amperes)
    print (result)

opcao = input("1 - Tensao | 2 - Corrente | 3 - Resistencia | ")
if opcao == "1":
    tensao()
elif opcao== "2":
    corrente()
elif opcao == "3":
    resistencia()
else: 
    print("Opção Inválida")