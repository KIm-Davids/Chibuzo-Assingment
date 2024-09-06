use cape_codd;
SELECT OrderNumber, SKU
FROM order_item
WHERE (Quantity * Price) <> ExtendedPrice
ORDER BY OrderNumber, SKU