(defn candy1
  [left right]
  (let [x (+ (quot right 2) (quot left 2))];)
  ;(+ (quot right 2) (quot left 2))
  (if
  (not= 0 (rem x 2))
  (inc x)
  x))
  )

(defn candy2
  [[a b c d]]
  [(candy1 c a) (candy1 a b) (candy1 b c) (inc d)]
  )

(defn candy3
  [[a b c d]]
  
    (loop [first1 [a b c d] result []]
      ;(println (candy2 first1))
      (if (not= a b c)
        (let x (candy2 first1)
          (recur x (conj result x ;(candy2 first1)
                       )
                 ;result
                 )
          )        
        result
      )
    )

(defn candy-test [[ a b c d]]
  ;(let [x (read-line)]
    ;(candy3 [a b c d])
   ; )
  (candy2 [(read-line)])
  )
