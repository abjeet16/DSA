class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        return diffWaysToCompute(expression, new HashMap<>());}

private List<Integer> diffWaysToCompute(String expression, Map<String, List<Integer>> map) {
if (map.containsKey(expression))
	return map.get(expression);
	
var values = new ArrayList<Integer>();
if (!hasOperator(expression)) {
	// base case
	values.add(Integer.parseInt(expression));
} else {
	// Recursive case. DFS
	for (var i = 0; i < expression.length(); i++) {
		var symbol = expression.charAt(i);
	
		if (!Character.isDigit(symbol)) {
			var left = diffWaysToCompute(expression.substring(0, i), map);
			var right = diffWaysToCompute(expression.substring(i + 1), map);
			for (var l : left) {
				for (var r : right) {
					switch (symbol) {
						case '+' -> values.add(l + r);
						case '-' -> values.add(l - r);
						case '*' -> values.add(l * r);
					}
				}
			}
		}
	}
}

map.put(expression, values);
return values;}

private boolean hasOperator(String expression) {
for (var i = 0; i < expression.length(); i++)
	switch (expression.charAt(i)) {
		case '+', '-', '*' -> {
			return true;
		}
	}
return false;
}
}