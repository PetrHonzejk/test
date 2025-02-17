package cz.pslib.test

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


class PostViewModel : ViewModel() {

  /* TODO: Implementace loadPosts method.
    Vytvořte data class Post se správnými parametry
    Definujte API rozhraní se suspend funkcí
    Vytvořte singleton Retrofit instanci s Base URL a Gson konvertorem
    Implementujte error handling pomocí try/catch
     */

    private fun loadPosts() {
        viewModelScope.launch {
           Log.v("PostViewModel", "loadPosts")
        }
    }
}