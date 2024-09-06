use cape_codd;
SELECT Department, Buyer, count(SKU) AS Dept_Buyer_SKU_Count
FROM sku_data
Group by Department, Buyer