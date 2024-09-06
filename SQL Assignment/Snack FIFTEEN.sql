use cape_codd;
SELECT Department, COUNT(SKU) AS Dept_SKU_Count
FROM sku_data
WHERE SKU <> 30200
GROUP BY Department
HAVING COUNT(SKU) > 1
ORDER BY Dept_SKU_Count ASC;