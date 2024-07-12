package ConexionConSqL.SQLProgramando;

/*
create or replace function sin_param()
returns TEXT
as $$
begin
	return 'Funciona';
end $$
language 'plpgsql';

select sin_param()

--FUNCIONES QUE DEVUELVEN UNA TABLA.
--Funcion Crear una función que devuelva una tabla con los productos que terminen en N

drop function productos_terminen_n();

CREATE OR REPLACE FUNCTION productos_terminen_n()
RETURNS TABLE(productid products.product_id%type, productname varchar, unitprice real, unitsinstock smallint)
AS $$
BEGIN
  RETURN QUERY
    SELECT product_id, product_name, unit_price, units_in_stock
    FROM PRODUCTS
    WHERE  product_name LIKE '%n';
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION public.get_max_price(
	)
    RETURNS numeric
    LANGUAGE 'plpgsql'
    COST 100
    VOLATILE PARALLEL UNSAFE
AS $BODY$
declare
	max_price numeric;
begin
	select max(unit_price)
	into max_price
	from products;
	return max_price;
end
$BODY$;

ALTER FUNCTION public.get_max_price()
    OWNER TO postgres;

 */
