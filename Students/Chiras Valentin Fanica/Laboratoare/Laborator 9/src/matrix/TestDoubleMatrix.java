package matrix;

public class TestDoubleMatrix {
		public static void main(String[] args) {
			System.out.println("   ");
			Float[][] m3 = new Float[][] { {  1.1f, 2.2f, 3.3f }, { 4.4f, 5.5f, 6.6f }, { 1.1f, 1.1f, 1.1f } };
			Float[][] m4 = new Float[][] { { 1f, 1f, 1f }, { 2f, 2f, 2f }, { 0f, 0f, 0f } };
			FloatMatrix FloatMatrix = new FloatMatrix();
			System.out.println("m3 + m4 is ");
			GenericMatrix.printResult(m3, m4, FloatMatrix.addMatrix(m3, m4), '+');
			System.out.println("\nm3 * m4 is ");
			GenericMatrix.printResult(m3, m4, FloatMatrix.multiplyMatrix(m3, m4), '*');
			Float cons = 3.0f;
			System.out.println("\n");
			GenericMatrix.printResult(m3,cons,FloatMatrix.addConstant(m3, cons),'+');
		}
}
