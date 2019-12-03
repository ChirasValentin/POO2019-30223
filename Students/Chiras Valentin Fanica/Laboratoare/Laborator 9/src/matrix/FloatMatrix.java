package matrix;

public class FloatMatrix extends GenericMatrix<Float> {

	@Override
	protected Float add(Float o1, Float o2) {
		return o1 + o2;
	}

	@Override
	protected Float multiply(Float o1, Float o2) {
		return o1 * o2;
	}

	@Override
	protected Float zero() {
		return 0f;
	}

	@Override
	protected Float addWithConst(Float o1, Float cons) {
		
		return o1 + cons;
	}

}
