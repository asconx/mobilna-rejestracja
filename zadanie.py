def zadanie():
    dodawanie = input("dodaj liczby ")
    tabela = list(map(int, dodawanie.split()))
    
    length = len(tabela)
    for i in range(length):
        for j in range(length - 1 - i):
            if tabela[j] < tabela[j + 1]:
                temp = tabela[j]
                tabela[j] = tabela[j + 1]
                tabela[j + 1] = temp

    print(tabela)

zadanie()
