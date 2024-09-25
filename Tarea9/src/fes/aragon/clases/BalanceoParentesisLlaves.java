package fes.aragon.clases;

public class BalanceoParentesisLlaves {

    public boolean estanBalanceados(String expresion) {
        Pila<Character> pila = new Pila<>();

        // Recorrer cada caracter de la expresión
        for (char c : expresion.toCharArray()) {
            // Si es una llave o paréntesis de apertura, lo apilamos
            if (c == '{' || c == '(') {
                pila.push(c);
            }
            // Si es una llave o paréntesis de cierre
            else if (c == '}' || c == ')') {
                // Si la pila está vacía, no hay apertura correspondiente
                if (pila.isEmpty()) {
                    return false;
                }
                // Verificamos si el último elemento en la pila es el correspondiente
                char ultimo = pila.pop();
                if (c == '}' && ultimo != '{' || c == ')' && ultimo != '(') {
                    return false;
                }
            }
        }
        // si la pila está vacía todo esta balanceado
        return pila.isEmpty();
    }
}
