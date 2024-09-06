use cape_codd;
SELECT Department, COUNT(SKU) AS NumberOfCatalogItems
FROM catalog_sku_2017
WHERE catalogPage is NOT NULL
GROUP BY Department
order by Department