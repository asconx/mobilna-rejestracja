def znajdz_maksymalna(lista,start):
    indeks_maksymalna = start
    for i in range(start + 1,len(lista)):
        if lista[i] > lista[indeks_maksymalna]:
            indeks_maksymalna = 1
    return indeks_maksymalna
def sortuj(lista):
    for i in range(len(lista)):
        indeks_maksymalna = znajdz_maksymalna(lista, i)
    lista[i], lista[indeks_maksymalna] = lista[indeks_maksymalna], lista[i]
def main():
    print("Witaj w programie do sortowania listy liczba całkowitych!")
    print("Podaj 10 liczba całkowitych oddzielonych spacją: ")
try:
    lista = lista = list(map(int, input().split()))
    print("")
    
except