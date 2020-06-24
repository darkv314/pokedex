package bo.upb.programacion3.codelabpokedex.utils;

import java.util.ArrayList;
import java.util.List;

import bo.upb.programacion3.codelabpokedex.R;
import bo.upb.programacion3.codelabpokedex.model.Pokemon;

public class PokemonUtils {

    /**
     * Get list of pokemons
     *
     * @return List of pokemons in the pokedex
     */
    public static List<Pokemon> getPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1, "Mudkip", R.drawable.mudkip, "Water"));
        pokemons.add(new Pokemon(2, "Mega Swampert", R.drawable.mega_swampert, "Water/Ground"));
        pokemons.add(new Pokemon(3, "Meowstic", R.drawable.meowstic, "Psychic"));
        pokemons.add(new Pokemon(4, "Delcatty", R.drawable.delcatty, "Normal"));
        pokemons.add(new Pokemon(5, "Delphox", R.drawable.delphox, "Fire/Psychic"));
        pokemons.add(new Pokemon(6, "Vespiquen", R.drawable.vespiquen, "Bug/Flying"));
        pokemons.add(new Pokemon(7, "Volcarona", R.drawable.volcarona, "Bug/Fire"));
        pokemons.add(new Pokemon(8, "Froslass", R.drawable.froslass, "Ice/Ghost"));
        pokemons.add(new Pokemon(9, "Pachirisu", R.drawable.pachirisu, "Electric"));
        pokemons.add(new Pokemon(10, "Yveltal", R.drawable.yveltal, "Dark/Flying"));
        pokemons.add(new Pokemon(11, "Pikachu", R.drawable.pikachu, "Electric"));
        pokemons.add(new Pokemon(12, "Bulbasaur", R.drawable.bulbasaur, "Grass"));
        pokemons.add(new Pokemon(13, "Charmander", R.drawable.charmander, "Fire"));
        pokemons.add(new Pokemon(14, "Squirtle", R.drawable.squirtle, "Water"));
        pokemons.add(new Pokemon(15, "Snorlax", R.drawable.snorlax, "Normal"));
        pokemons.add(new Pokemon(16, "ButterFree", R.drawable.butterfree, "Bug"));
        pokemons.add(new Pokemon(17, "Ekans", R.drawable.ekans, "Poison"));
        pokemons.add(new Pokemon(18, "Pidgey", R.drawable.pidgey, "Normal"));
        pokemons.add(new Pokemon(19, "Rattata", R.drawable.rattata, "Normal"));
        pokemons.add(new Pokemon(20, "Sandshrew", R.drawable.sandshrew, "Ground"));
        pokemons.add(new Pokemon(21, "Venonat", R.drawable.venonat, "Bug"));
        pokemons.add(new Pokemon(22, "Zubat", R.drawable.zubat, "Poison"));
        return pokemons;
    }
    public static List<Pokemon> getFPokemons()
    {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1, "Mudkip", R.drawable.mudkip, "Water"));
        pokemons.add(new Pokemon(2, "Mega Swampert", R.drawable.mega_swampert, "Water/Ground"));
        pokemons.add(new Pokemon(3, "Meowstic", R.drawable.meowstic, "Psychic"));
        pokemons.add(new Pokemon(4, "Delcatty", R.drawable.delcatty, "Normal"));
        pokemons.add(new Pokemon(5, "Delphox", R.drawable.delphox, "Fire/Psychic"));
        pokemons.add(new Pokemon(6, "Vespiquen", R.drawable.vespiquen, "Bug/Flying"));
        pokemons.add(new Pokemon(7, "Volcarona", R.drawable.volcarona, "Bug/Fire"));
        pokemons.add(new Pokemon(8, "Froslass", R.drawable.froslass, "Ice/Ghost"));
        pokemons.add(new Pokemon(9, "Pachirisu", R.drawable.pachirisu, "Electric"));
        pokemons.add(new Pokemon(10, "Yveltal", R.drawable.yveltal, "Dark/Flying"));
        return pokemons;
    }
}
