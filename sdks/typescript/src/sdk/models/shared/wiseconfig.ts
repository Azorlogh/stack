/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Expose } from "class-transformer";

export class WiseConfig extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "apiKey" })
  apiKey: string;
}
