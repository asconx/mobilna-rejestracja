def znajdz_maksymalna(lista,start):
        indeks_maksymalna = start
        for i in range(start + 1,len(lista)):
                if lista[i] > lista[indeks_maksymalna]:
                        indeks_maksymalna = 1
                        return indeks_maksymalna