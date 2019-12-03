package matrix;

public class DoubleMatrix extends GenericMatrix<Double> {

	@Override
	protected Double add(Double o1, Double o2) {
		return o1 + o2;
	}

	@Override
	protected Double multiply(Double o1, Double o2) {
		return o1 * o2;
	}

	@Override
	protected Double zero() {
		return 0.0;
	}

	@Override
	protected Double addWithConst(Double o1, Double cons) {
		return o1 + cons;
	}

}
