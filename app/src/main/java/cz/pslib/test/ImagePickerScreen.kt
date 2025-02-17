package cz.pslib.test

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ImagePickerScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {

            //TODO: Implementace výběru obrázku

        }) {
            Text("Vybrat obrázek")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // TODO: Nahradit kód a zde zobrazit vybraný obrázek

        Text("Zde bude vybraný obrázek",
                fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))
        Text("Pro testování zobrazení obrázku v emulátoru, nahraj obrázek v Android Studiu: View > Tool Windows > Device File Explorer a nahraj ho třeba do složky  storage/emulated/0/DCIM.",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Justify)
    }


}
@Preview(showBackground = true)
@Composable
fun ImagePickerScreenPreview() {
    ImagePickerScreen()
}