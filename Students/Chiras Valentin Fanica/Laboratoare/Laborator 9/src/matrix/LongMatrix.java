package matrix;

public class LongMatrix extends GenericMatrix<Long> {

	@Override
	protected Long add(Long o1, Long o2) {
		return o1 + o2;
	}

	@Override
	protected Long multiply(Long o1, Long o2) {
		return o1 * o2;
	}

	@Override
	protected Long zero() {
		return 0l;
	}

	@Override
	protected Long addWithConst(Long o1, Long cons) {
		return o1 + cons;
	}

}
