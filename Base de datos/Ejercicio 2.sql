1.	SELE9
employee_id, last_name, department_id, job_id
	FROM Emloyees
	Where department_id >=90 and department_id <=10;
	
2.	SELECT employee_id, last_name, department_id, job_id
	FROM Emloyees
	Where department_id Between 90 AND 110;

3.	SELECT employee_id, last_name, salary
		FROM Employees
		WHERE salary IN (8000, 11000, 7000);
		
4.	SELECT employee_id, last_name, job_id, salary
		FROM Employees
		WHERE salary > 10000 AND department_id = 80;
		
		
5.	SELECT * 
		FROM Regions
		WHERE Region_name IN (‘Europe’, ‘Asia’);
		
6.	SELECT Street_address, city, state_province
		FROM Locations
		WHERE city IN (‘Rome’, ‘Munich’)
		
7.	SELECT *
		FROM Jobs
		WHERE min_salary < 3000 AND max_salary > 4000;
		
8.	SELECT min_salary, max_salary
		FROM Jobs
		WHERE job_tittle = “Programmer”;
		
9.	SELECT last_name, commission_pct
		FROM Employees
		WHERE commission_pct > 0,25
		ORDER BY last_name ASC;
		
10.	SELECT *
		FROM Employees
		WHERE department_id = 100;
		
11.	SELECT *
		FROM Jobs
		ORDER BY job_tittle DESC;
		
12.	SELECT first_name, last_name, salary
		FROM Employees
		WHERE first_name = ‘Kelly’ OR last_name = ‘Smith’;
13.	SELECT first_name, last_name, department_id

		FROM Employees
		WHERE department_id IN (10, 20, 90);
		
14.	SELECT first_name, last_name, department_id

		FROM Employees
		WHERE department_id NOT IN (10, 30, 40, 50, 60, 80, 90, 100, 110);
		
15.	SELECT last_name, salary, department_id
		FROM Employees
		WHERE department_id IS NULL;
		
16.	SELECT first_name, last_name
		FROM Employees
		WHERE first_name LIKE 'G%' AND last_name NOT LIKE 'g%';
		
17.	SELECT last_name, commission_pct
		FROM Employees
		WHERE last_name LIKE '%a%'
		ORDER BY salary ASC;
		
18.	SELECT MIN(hire_date)
		FROM Employees;
		
19.	SELECT AUG(commission_pct)
		FROM Employees;
		WHERE commission_pct IS NOT NULL;
		
20.	SELECT MAX(department_id)
		FROM Employees;
		
21.	SELECT COUNT(*)
		FROM Countries;
		
22.	SELECT DISTINCT COUNT(region_id)
		FROM Countries;
		
23.	SELECT department_id, MIN(salary)
		FROM Employees
		
	GROUP BY department_id;
	
24.	SELECT department_id, jod_id, MAX(salary)
		FROM Employees
		GROUP BY department_id, jod_id;
		
25.	SELECT region_id, COUNT(country_ id)
		FROM Countries
		GROUP BY region_id;
		
26.	SELECT region_id, COUNT(country_id)
		FROM Countries
		GROUP BY region_id
		HAVING COUNT(country_id) > 7;
		
27.	SELECT department_id, COUNT (employee_id)
		FROM Employees
		GROUP BY department_id
		HAVING last_name LIKE '%a%';