def function1(list):
 
    size = len(list)
 
    for elem in range(0, size):
        foo = False
 
        for elem2 in range(0, size - elem - 1):
            if list[elem2] > list[elem2 + 1]:
                list[elem2], list[elem2 + 1] = list[elem2 + 1], list[elem2]
                foo = True
 
        if not foo: break
 
    return list