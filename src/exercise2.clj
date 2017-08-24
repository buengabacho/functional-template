(ns exercise2)

(defn greater-than-five?
  "Returns whether a number is greater than five"
  [number]
  (> number 5)
)

(defn only-greater-than-five
  "Returns list with numbers greater than five from original list"
  [inputList]
  (filter greater-than-five? inputList)
)