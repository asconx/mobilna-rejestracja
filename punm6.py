def znajdz_maksymalna(lista, start):

    indeks_maksymalnej = start
    for i in range(start + 1, len(lista)):
        if lista[i] > lista[indeks_maksymalnej]:
            indeks_maksymalnej = i
    return indeks_maksymalnej