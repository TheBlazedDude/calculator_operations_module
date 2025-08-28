package ch.bbw.BenBrc.model.operations;

import ch.bbw.BenBrc.model.Operation;

/**
 * Square Root operation implementation.
 * This operation calculates the square root of a number.
 */
public class SquareRootOperation implements Operation {
    
    @Override
    public String getSymbol() {
        return "sqrt";
    }
    
    @Override
    public String getName() {
        return "Square Root";
    }
    
    @Override
    public double perform(double... operands) throws ArithmeticException {
        if (operands.length < 1) {
            throw new ArithmeticException("Square root requires at least one operand");
        }
        
        if (operands[0] < 0) {
            throw new ArithmeticException("Cannot calculate square root of a negative number");
        }
        
        return Math.sqrt(operands[0]);
    }
}