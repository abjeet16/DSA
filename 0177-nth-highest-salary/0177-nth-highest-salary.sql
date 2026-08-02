CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    RETURN (
        SELECT DISTINCT salary
        FROM Employee e1
        WHERE N = (
            SELECT COUNT(DISTINCT salary)
            FROM Employee e2
            WHERE e2.salary >= e1.salary
        )
    );
END
#select salary from Employee as e1 where N=(select distinct count(*) from Employee as e2 where e1.salary <=e2.salary));