CREATE DATABASE pokedex
BACKUP DATABASE pokedex TO DISK = '/Desktop/Warmup_2-17' WITH DIFFERENTIAL;

CREATE TABLE Pokemon (
PokemonID int,
DexNumber int,
Name varchar(255),
Type varchar(255)
)
