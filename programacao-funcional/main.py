import pycep_correios
import urllib
import cgi
import urllib

# EXEMPLO 1 -------------------------------------------------------------------------------------------

print('Exemplo 1: dada uma lista de endereços, pode retornar uma lista de cidades e estados apenas.')

enderecos = ['19930000', '13054351', '86360000', '86380000', '86390000', '19920000', '80010010', '18703757', '86010390',
             '87005', '86604298']

def func(x):
    try:
        aux = {}
        url = 'https://viacep.com.br/ws/%s/json/' % x
        headers = {'User-Agent': 'Autociencia/1.0'}
        requisicao = urllib.request.Request(url, headers=headers, method='GET')
        cliente = urllib.request.urlopen(requisicao)
        conteudo = cliente.read().decode('utf-8')
        cliente.close()
        return conteudo
    except:
        pass

consultarCEP = map(lambda x: func(str(x)), enderecos)
for x in list(consultarCEP):
    print(x)

# EXEMPLO 2 -------------------------------------------------------------------------------------------

print("\nExemplo 2: em uma lista de valores inteiros, retornar o dobro de cada valor na mesma posição.")
lista = range(1, 11)
print(list(lista))
dobrarValor = map(lambda x: x * 2, lista)
print(list(dobrarValor))
