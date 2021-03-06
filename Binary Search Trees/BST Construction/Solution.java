import java.util.*;

class Program {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    BST newBST = new BST (value);
                    left = newBST;
                } else {
                    left.insert(value);
                }
            } else if (value > this.value) {
                if (right == null) {
                    BST newBST = new BST (value);
                    right = newBST;
                } else {
                    right.insert(value);
                }
            }
            return this;
        }

        public boolean contains(int value) {
            if (value < this.value) {
                if (left == null) { return false; }
                left.contains(value);
            } else if (value > this.value) {
                if (right == null) { return false; }
                right.contains(value);
            }
            return true; // if value == this.value
        }

        public BST remove(int value) {
            return this;
        }
    }
}