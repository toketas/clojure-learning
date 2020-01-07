(ns fib.fib
  (:gen-class))

(defn fib
  [n]
  (if (not= (type n) (type 0)) "Received a non-number" (if (< n 1) "It must be greater than 0 mdfk" (if (= n 1) 0 (if (= n 2) 1 (+ (fib (- n 2)) (fib (- n 1))))))))

(defn -main [] ())
