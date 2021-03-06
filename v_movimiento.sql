use distribuidas;
----------------------------------------------------

create view v_movimiento(
cliecodigo, cliepaterno,
cliematerno, clienombre, cuencodigo, cuensaldo,
cuenestado, movinumero, movifecha, moviimporte,
cuenreferencia, tipocodigo, tiponombre, tipoaccion,
monecodigo, monenombre)  
as     
select    

  cl.chr_cliecodigo  cliecodigo,
  cl.vch_cliepaterno cliepaterno,
  cl.vch_cliematerno cliematerno,
  cl.vch_clienombre  clienombre,
  c.chr_cuencodigo  cuencodigo,
  c.dec_cuensaldo   cuensaldo,
  c.vch_cuenestado  cuenestado,
  m.int_movinumero  movinumero,
  m.dtt_movifecha   movifecha,
  m.dec_moviimporte moviimporte,
  IF(ISNULL(m.chr_cuenreferencia),'NONE',m.chr_cuenreferencia)  cuenreferencia,
  tm.chr_tipocodigo  tipocodigo,
  tm.vch_tipodescripcion tiponombre,
  tm.vch_tipoaccion  tipoaccion,
  mo.chr_monecodigo  monecodigo,
  mo.vch_monedescripcion monenombre  
from tipomovimiento tm   
join movimiento m on tm.chr_tipocodigo = m.chr_tipocodigo     
join cuenta c on m.chr_cuencodigo = c.chr_cuencodigo     
join moneda mo on c.chr_monecodigo = mo.chr_monecodigo     
join cliente cl on c.chr_cliecodigo = cl.chr_cliecodigo;



select * from v_movimiento  
where cuencodigo='00100002';

/*

select   
CUENCODIGO, MONENOMBRE, CUENSALDO, CUENESTADO,  
MOVINUMERO, MOVIFECHA, MOVIIMPORTE, TIPOCODIGO, TIPONOMBRE  
from v_movimiento
where CUENCODIGO = '00100001'
order by movinumero desc
limit 2;


*/





