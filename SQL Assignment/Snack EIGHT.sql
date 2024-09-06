use cape_codd;
SELECT SUM(ExtendedPrice) AS OederItemSum, AVG(ExtendedPrice) AS OrderItemAvg, MIN(ExtendedPrice) AS OrderItemMin, MAX(ExtendedPrice) AS OrderItemMax
FROM Order_item