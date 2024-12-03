def znajdz_maksymalna(lista, start):
    indeks_maksymalna = start
    for i in range(start + 1, len(lista)):
        if lista[i] > lista[indeks_maksymalna]:
            indeks_maksymalna = i  # Corrected from 1 to i
    return indeks_maksymalna

def sortuj(lista):
    for i in range(len(lista)):
        indeks_maksymalna = znajdz_maksymalna(lista, i)
        lista[i], lista[indeks_maksymalna] = lista[indeks_maksymalna], lista[i]  # Indentation corrected

def main():
    print("Witaj w programie do sortowania listy liczba całkowitych!")
    print("Podaj 10 liczba całkowitych oddzielonych spacją: ")
    try:
        lista = list(map(int, input().split()))
        sortuj(lista)
        print("Posortowana lista:", lista)
    except ValueError:
        print("Podano nieprawidłowe dane. Upewnij się, że wprowadzasz liczby całkowite.")

if __name__ == "__main__":
    main()
