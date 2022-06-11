package com.learn.tipcalculator.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.Money
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun InputField(modifier: Modifier =Modifier,
    valueState: MutableState<String>,
               labeledId:String,
               enabled:Boolean,
               isSingleLine:Boolean,
               keyboardType:KeyboardType= KeyboardType.Number,
               imeAction: ImeAction= ImeAction.Next,
               onAction:KeyboardActions= KeyboardActions.Default
){

    OutlinedTextField(value = valueState.value,
        onValueChange = { valueState.value=it },
        label = { Text(text = labeledId)},
        leadingIcon = { Icon(imageVector = Icons.Rounded.AttachMoney, contentDescription ="money icon" ,
        )}, singleLine = isSingleLine, textStyle= TextStyle(fontSize = 18.sp, color = MaterialTheme.colors.onBackground),
        modifier=Modifier.padding(bottom = 10.dp, start = 10.dp,end=10.dp),
        enabled = enabled,
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType, imeAction = imeAction),
        keyboardActions = onAction
    )

}