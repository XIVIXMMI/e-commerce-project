import { FormControl, ValidationErrors } from "@angular/forms";

export class Luv2ShopValidators {

    /*white-space validation
    * if validation check fails then return validation error(s)
    * if validation check passes return null
    */
    static notOnlyWhiteSpace(control: FormControl): ValidationErrors{

        //check if string only contain whitespace
        if((control.value != null) && (control.value.trim().length === 0)){

            //invalid return error obj
            return {'notOnlyWhitespace': true};
        }
        //valid return null
        return null as any;
        
    }
}
