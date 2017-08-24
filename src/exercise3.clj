(ns exercise3)

(defn fibonacci
  "Returns number from the Fibonacci sequence at position x"
  [x]
  (if (<= x 1) x (+ (fibonacci (- x 1)) (fibonacci (- x 2))) )
)