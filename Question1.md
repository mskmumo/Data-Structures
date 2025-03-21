Questions:
1. With the aid of examples explain the rules of Big O notation in algorithm analysis (5marks)

--Big O notation is a powerful tool in algorithm analysis because it helps us understand the upper limit or worst-case performance of an algorithm. In other words, it helps us answer the question: “How fast or how efficient is an algorithm as the input data grows?"

1. Worst‐Case Scenario:
Big O notation typically reflects the worst-case running time. This means we assume the most time‐consuming situation to guarantee an upper bound.

2. Ignoring Constant Factors:
Multiplicative constants are dropped because they don’t affect the growth rate for large inputs.

3. Dominant Term Rule:
When an expression has multiple terms, the term that grows the fastest dominates for large input sizes. Lower-order terms can be omitted.

4. Addition Rule:
When combining two sequential operations, their individual complexities are added—but in asymptotic analysis, only the highest order term matters.

5. Multiplication (Nested Loops) Rule:
When operations are nested (e.g., a loop inside another loop), the complexities multiply.

