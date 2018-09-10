package s2it;

// Questão 9
public class BinaryTree {

	private int valor;

	private BinaryTree left;

	private BinaryTree right;

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

    public int somaNosArvore(BinaryTree tree) {

		if (tree == null)
			return 0;

        int result = tree.getValor() + somaNosArvore(tree.getLeft()) + somaNosArvore(tree.getRight());
		
        return result;
	}

}
