





select (case
when price < 10000 then 0
else truncate(price, -4)
end) price_group, count(product_id) products
from product
group by price_group
order by price_group












