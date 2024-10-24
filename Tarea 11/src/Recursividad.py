class Stack:
    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        if not self.is_empty():
            return self.items.pop()
        return None

    def is_empty(self):
        return len(self.items) == 0

    def size(self):
        return len(self.items)


def find_middle(stack, current_index, middle_index):
    if current_index == middle_index:
        return stack.pop()

    top = stack.pop()
    middle_value = find_middle(stack, current_index + 1, middle_index)
    stack.push(top)
    return middle_value

def get_middle(stack):
    size = stack.size()
    middle_index = size // 2
    return find_middle(stack, 0, middle_index)

stack = Stack()
stack.push(1)
stack.push(2)
stack.push(3)
stack.push(4)
stack.push(5)

middle_value = get_middle(stack)
print("Ejercicio 1: ")
print("Valor en la posición media:", middle_value)
print(" ")


# Ejercicio 2
def suma_lista(lista):
    if not lista:
        return 0
    return lista[0] + suma_lista(lista[1:])

lista_enteros = [1, 2, 3, 4, 5]
resultado = suma_lista(lista_enteros)

print("Ejercicio 2: ")
print("La suma de la lista es:", resultado)