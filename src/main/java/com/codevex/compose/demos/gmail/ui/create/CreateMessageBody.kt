package com.codevex.compose.demos.gmail.ui.create

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun CreateMessageBody(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row {
            Text(
                text = "From",
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.CenterVertically)
            )
            Text(
                text = "subash@gmail.com",
                modifier = Modifier
                    .weight(1f)
                    .padding(vertical = 16.dp)
                    .align(Alignment.CenterVertically)
            )
            Icon(
                imageVector = Icons.Outlined.KeyboardArrowDown,
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(16.dp)
            )
        }
        HorizontalDivider(thickness = 0.5.dp, color = Color.LightGray)
        Row {
            Text(
                text = "To",
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.CenterVertically)
            )
            BasicTextField(
                value = TextFieldValue("Subash"),
                onValueChange = { },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                keyboardActions = KeyboardActions(onDone = {}),
                modifier = Modifier
                    .weight(1f)
                    .padding(vertical = 16.dp)
                    .align(Alignment.CenterVertically)
            )
            Icon(
                imageVector = Icons.Outlined.KeyboardArrowDown,
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(16.dp)
            )
        }

        HorizontalDivider(thickness = 0.5.dp, color = Color.LightGray)
        BasicTextField(
            value = TextFieldValue("Subject"),
            onValueChange = { },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            keyboardActions = KeyboardActions(onDone = {}),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp, horizontal = 16.dp)
        )
        HorizontalDivider(thickness = 0.5.dp, color = Color.LightGray)
        BasicTextField(
            value = TextFieldValue("Compose email"),
            onValueChange = { },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            keyboardActions = KeyboardActions(onDone = {}),
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(vertical = 16.dp, horizontal = 16.dp)
        )

    }
}