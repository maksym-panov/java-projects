package corejava.tasks.equationtest.paramcareful.tworootsreversed;

import corejava.tasks.equationtest.QuadraticEquationTwoRootsCasesTesting;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParamCarefulTwoRootsReversedOrderQuadraticEquationTwoRootsCasesTesting extends QuadraticEquationTwoRootsCasesTesting {

    public ParamCarefulTwoRootsReversedOrderQuadraticEquationTwoRootsCasesTesting(final double a, final double b, final double c, final String expected) {
        super(a, b, c, expected);
        quadraticEquation = new ParamCarefulTwoRootsReversedOrderQuadraticEquation();
    }
}
