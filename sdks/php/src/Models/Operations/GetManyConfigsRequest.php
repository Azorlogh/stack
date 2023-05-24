<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace formance\stack\Models\Operations;

use \formance\stack\Utils\SpeakeasyMetadata;
class GetManyConfigsRequest
{
    /**
     * Optional filter by endpoint URL
     * 
     * @var ?string $endpoint
     */
	#[SpeakeasyMetadata('queryParam:style=form,explode=true,name=endpoint')]
    public ?string $endpoint = null;
    
    /**
     * Optional filter by Config ID
     * 
     * @var ?string $id
     */
	#[SpeakeasyMetadata('queryParam:style=form,explode=true,name=id')]
    public ?string $id = null;
    
	public function __construct()
	{
		$this->endpoint = null;
		$this->id = null;
	}
}