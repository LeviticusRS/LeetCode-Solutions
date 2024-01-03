package org.joshua.ransom;

public interface Solution<T, U> {
    default T bruteForce(U input) {
        throw new UnsupportedOperationException("Single parameter solution not supported.");
    }
}
